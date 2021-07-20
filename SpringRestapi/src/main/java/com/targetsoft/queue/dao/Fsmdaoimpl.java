package com.targetsoft.queue.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.targetsoft.queue.model.curve_bhel;
@Repository
public class Fsmdaoimpl implements FSMdao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public curve_bhel fetchByTime(String time) {
		// TODO Auto-generated method stub
		return jdbcTemplate
                .queryForObject("SELECT * FROM curve_bhel c WHERE c.time = " + time,  
                												(rs, rowNum) ->
                												new curve_bhel(rs.getString("time"),
                														rs.getString("ms_flow"),
                														rs.getString("rh_flow"),
                														rs.getString("sh_temp"),
                														rs.getString("rh_temp"),
                														rs.getString("ms_press"),
                														rs.getString("load"),
                														rs.getString("turbine_steamflow"),
                														rs.getString("rh_press"))
                		);
	}

}
