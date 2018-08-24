package info.lukasznowicki.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DateTime {

	@Id
	private long id;

	private java.sql.Date dateSql;
	private java.sql.Time dateTimeSql;
	private java.sql.Timestamp timeStampSql;

	@Temporal(TemporalType.DATE)
	private java.util.Date dateUtil;
	@Temporal(TemporalType.TIME)
	private java.util.Date timeUtil;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date timeStampUtil;
	
	
	private java.util.Calendar dateCalendar;

	
	public java.sql.Date getDateSql() {
		return dateSql;
	}

	public void setDateSql(java.sql.Date dateSql) {
		this.dateSql = dateSql;
	}

	public java.util.Calendar getDateCalendar() {
		return dateCalendar;
	}

	public void setDateCalendar(java.util.Calendar dateCalendar) {
		this.dateCalendar = dateCalendar;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.util.Date getDateUtil() {
		return dateUtil;
	}

	public void setDateUtil(java.util.Date dateUtil) {
		this.dateUtil = dateUtil;
	}

	public java.sql.Time getDateTimeSql() {
		return dateTimeSql;
	}

	public void setDateTimeSql(java.sql.Time dateTimeSql) {
		this.dateTimeSql = dateTimeSql;
	}

	public java.sql.Timestamp getTimeStampSql() {
		return timeStampSql;
	}

	public void setTimeStampSql(java.sql.Timestamp timeStampSql) {
		this.timeStampSql = timeStampSql;
	}

}
