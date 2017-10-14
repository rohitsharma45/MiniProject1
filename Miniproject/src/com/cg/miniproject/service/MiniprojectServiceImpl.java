package com.cg.miniproject.service;

import com.cg.miniproject.dao.IMiniprojectDao;
import com.cg.miniproject.dao.MiniprojectDaoImpl;
import com.cg.miniproject.dto.MiniprojectBean;

public class MiniprojectServiceImpl implements IMiniprojectService {
	IMiniprojectDao dao=null;
	@Override
	public int insertData(MiniprojectBean bean) {
		 dao=new MiniprojectDaoImpl();
		return dao.insertData(bean);
	}
	@Override
	public String getProgramId() {
		dao=new MiniprojectDaoImpl();
			return dao.getProgramId();
	}

}
