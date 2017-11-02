package com.neuedu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.bean.BbsUserinfo;

/**
 * Servlet implementation class AddTopicServlet
 */
@WebServlet("/add_topic.do")
public class AddTopicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTopicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//判断用户是否登录
		//不会创建新的会话，只会获取和当前用户已有会话
		HttpSession httpSession = request.getSession();

		BbsUserinfo bui = (BbsUserinfo)httpSession.getAttribute("userinfo");
		if(bui != null)//如果已经登录，转发到发表帖子jsp
		{
			request.getRequestDispatcher("/jsp/add_topic.jsp").forward(request, response);
		}
		else//如果未登录，重定向到登录页面
		{
			response.sendRedirect(request.getContextPath() + "/jsp/login.jsp");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
