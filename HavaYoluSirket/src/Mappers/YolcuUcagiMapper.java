package Mappers;

import java.sql.ResultSet;

import TechnicalServices.AbstractDBMapper;
import TechnicalServices.IMapper;

public class YolcuUcagiMapper extends AbstractDBMapper{
	
	public YolcuUcagiMapper(String tableName) {
		super(tableName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object getObjectFromResult(int ID, ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String buildObjectUpdateQuery(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
