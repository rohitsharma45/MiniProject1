package com.cg.miniproject.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.miniproject.dbutil.DbUtil;
import com.cg.miniproject.dto.MiniprojectBean;

public class MiniprojectDaoImpl implements IMiniprojectDao {
	Connection conn=null;
	int result=0;
	@Override
	public int insertData(MiniprojectBean bean) {
		try {
			conn=DbUtil.getConnection();
			System.out.println(conn);
		String insertQuery="Insert into Application values(Application_id_seq.nextval,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(insertQuery);
		ps.setString(1,bean.getFullName());
		ps.setDate(2,null);
		ps.setString(3, bean.getQualification());
		ps.setInt(4,bean.getMarks());
		ps.setString(5,bean.getGoals());
		ps.setString(6,bean.getEmail());
		ps.setString(7,bean.getProgramId());
		ps.setString(8,bean.getStatus());
		ps.setString(9,bean.getInterviewDate());
	
		int res=ps.executeUpdate();
		System.out.println(res);
		String sql="select Application_id_seq.currval from dual";
		Statement pst=conn.createStatement();
		
		ResultSet rs=pst.executeQuery(sql);
		
		
		while(rs.next())
		{
			result=rs.getInt(1);
		}
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public String getProgramId() {
		
		return null;
	}


}
