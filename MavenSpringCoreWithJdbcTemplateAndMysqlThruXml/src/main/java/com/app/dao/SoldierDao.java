package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.app.bean.Soldier;

@Repository
public class SoldierDao {
	private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Soldier> getSoldier(){
    	List<Soldier> list = new ArrayList<Soldier>();
    	list = this.jdbcTemplate.query("select name, age from soldierJdbc", new RowMapper() {
            public Soldier mapRow(ResultSet rs, int rowNum) throws SQLException {
                Soldier soldier = new Soldier();
                soldier.setName(rs.getString("name"));
                soldier.setAge(rs.getInt("age"));
                return soldier;
            }
        });
    	return list;
    }

}
