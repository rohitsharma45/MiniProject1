package com.cg.miniproject.dao;

import com.cg.miniproject.dto.MiniprojectBean;

public interface IMiniprojectDao {

	int insertData(MiniprojectBean bean);

	String getProgramId();

}
