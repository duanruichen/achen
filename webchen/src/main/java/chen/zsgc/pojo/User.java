package chen.zsgc.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * author:琛
 * date：2019/7/30 22:28
 * description:
 */
public class User implements Serializable {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public User(Integer id, String name, Boolean gender, Date create_time) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", create_time=" + create_time +
                '}';
    }
public User(){}
    private Integer id;
    private String name;
    private Boolean gender;
    private Date create_time;

}
