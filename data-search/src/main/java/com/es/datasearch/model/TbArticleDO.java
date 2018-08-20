package com.es.datasearch.model;

import java.io.Serializable;
import java.util.Date;

public class TbArticleDO implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.id
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.title
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.content
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.create_time
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.update_time
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_article
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.id
     *
     * @return the value of tb_article.id
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.id
     *
     * @param id the value for tb_article.id
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.title
     *
     * @return the value of tb_article.title
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.title
     *
     * @param title the value for tb_article.title
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.content
     *
     * @return the value of tb_article.content
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.content
     *
     * @param content the value for tb_article.content
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.create_time
     *
     * @return the value of tb_article.create_time
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.create_time
     *
     * @param createTime the value for tb_article.create_time
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.update_time
     *
     * @return the value of tb_article.update_time
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.update_time
     *
     * @param updateTime the value for tb_article.update_time
     *
     * @mbggenerated Mon Aug 20 09:58:50 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}