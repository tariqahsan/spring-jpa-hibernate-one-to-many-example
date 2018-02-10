package org.tahsan.jpa.springjpahibernateexample.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Table(name = "users_log", catalog = "test")
@Entity
public class UsersLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id")
    private Integer logId;

    private String log;
	
	@Column(name = "user_id")
    private Integer id;

    public UsersLog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

}
