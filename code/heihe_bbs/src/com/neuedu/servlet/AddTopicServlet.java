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
		//�ж��û��Ƿ��¼
		//���ᴴ���µĻỰ��ֻ���ȡ�͵�ǰ�û����лỰ
		HttpSession httpSession = request.getSession();

		BbsUserinfo bui = (BbsUserinfo)httpSession.getAttribute("userinfo");
		if(bui != null)//����Ѿ���¼��ת������������jsp
		{
			request.getRequestDispatcher("/jsp/add_topic.jsp").forward(request, response);
		}
		else//���δ��¼���ض��򵽵�¼ҳ��
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