package com.capg.service;

//public class UpdateService {
//
//}
import java.util.Date;

import com.capg.dao.UpdateDAO;


public class UpdateService {
public void Service(Date date1,Date date2) {
	UpdateDAO oo=new UpdateDAO();
	oo.Update(date1,date2);
}
}