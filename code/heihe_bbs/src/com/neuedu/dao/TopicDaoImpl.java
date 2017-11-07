package com.neuedu.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.neuedu.bean.BbsTopicInfoEx;
import com.neuedu.bean.BbsTopicinfo;
import com.neuedu.bean.BbsUserinfo;
import com.neuedu.util.DButil;

public class TopicDaoImpl implements ITopicDao{

	@Override
	public int addTopic(BbsTopicinfo bti) {
		// TODO Auto-generated method stub
		int ret = 0;
		Connection con =  null;
		PreparedStatement ps = null;
		try {
			con =  DButil.getInstance().getConnection();
			String strSql = "insert into tab_bbs_topicinfo(title,content"
					+ ",createtime,category_id,userid)"
					+ "values(?,?,?,?,?)";
			ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setString(1, bti.getTitle());
			ps.setString(2, bti.getContent());

			//java.sql.Date <-> java.util.Date
			long timeStamp = bti.getCreatetime().getTime();//java.util.Date
			java.sql.Date sqlDate = new java.sql.Date(timeStamp); 
			ps.setDate(3, sqlDate);
			
			ps.setInt(4, bti.getCategoryId());
			ps.setInt(5, bti.getUserid());

			
			ret = ps.executeUpdate();//成功返回1
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DButil.getInstance().close(con);
		DButil.getInstance().close(ps);
		return ret;
	}

	@Override
	public List<BbsTopicInfoEx> getAllTopics() {
		// TODO Auto-generated method stub
		Connection con =  null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<BbsTopicInfoEx> lst = new ArrayList<>();
		try {
			con =  DButil.getInstance().getConnection();
			String strSql = "select tbt.id, tbt.title,tbt.createtime,tbt.view_count,tbu.nickname,tbu.head_url from tab_bbs_topicinfo as tbt join tab_bbs_userinfo as tbu on tbt.userid = tbu.id";
			ps = (PreparedStatement) con.prepareStatement(strSql);
		
		
			
			rs = ps.executeQuery();
			while(rs.next())
			{
				String nickname = rs.getString("nickname");
				String title = rs.getString("title");
				Date date = rs.getDate("createtime");
				int view_count = rs.getInt("view_count");
				int id = rs.getInt("id");
				
				BbsTopicInfoEx btie = new BbsTopicInfoEx();
				btie.setTitle(title);
				btie.setNickname(nickname);
				btie.setViewCount(view_count);
				btie.setCreatetime(date);
				btie.setId(id);
				btie.setHead_url(rs.getString("head_url"));
				
				lst.add(btie);
				
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DButil.getInstance().close(con);
		DButil.getInstance().close(ps);
		DButil.getInstance().close(rs);
		return lst;
	}

	@Override
	public BbsTopicInfoEx getTopicByID(int id) {
		// TODO Auto-generated method stub
		Connection con =  null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BbsTopicInfoEx btie = new BbsTopicInfoEx();
		try {
			con =  DButil.getInstance().getConnection();
			String strSql = "select tbt.id, tbt.title, tbt.content,tbt.createtime,tbt.view_count,tbu.nickname from tab_bbs_topicinfo as tbt join tab_bbs_userinfo as tbu on tbt.userid = tbu.id where tbt.id = ?";
			ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setInt(1, id);
		
			
			rs = ps.executeQuery();
			while(rs.next())
			{
				String nickname = rs.getString("nickname");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Date date = rs.getDate("createtime");
				int view_count = rs.getInt("view_count");
				int tid = rs.getInt("id");
				
			
				btie.setTitle(title);
				btie.setNickname(nickname);
				btie.setViewCount(view_count);
				btie.setCreatetime(date);
				btie.setId(tid);
				btie.setContent(content);
				
			
				
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DButil.getInstance().close(con);
		DButil.getInstance().close(ps);
		DButil.getInstance().close(rs);
		return btie;
	}

	@Override
	public int insertTopicViewCounts(int id) {
		// TODO Auto-generated method stub
		int ret = 0;
		Connection con =  null;
		PreparedStatement ps = null;
		try {
			con =  DButil.getInstance().getConnection();
			String strSql = "update tab_bbs_topicinfo set view_count = view_count + 1 where id = ?";
			ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setInt(1, id);
		


			
			ret = ps.executeUpdate();//成功返回1
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DButil.getInstance().close(con);
		DButil.getInstance().close(ps);
		return ret;
	}

}
