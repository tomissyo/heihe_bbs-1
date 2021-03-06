package com.neuedu.bean;
import java.util.*;
import com.tgb.lk.annotation.*;

@AutoBean(alias = "BbsComment",table="tab_bbs_comment")
public class BbsComment {

  @AutoField(alias = "���", column = "id", isKey = true , isRequired = true , type="Integer", length=0)
  @ExcelVOAttribute(name = "id", column = "A")
  private int id;

  @AutoField(alias = "topicOrCommentId", column = "topic_or_comment_id", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "topic_or_comment_id", column = "B")
  private int topicOrCommentId;

  @AutoField(alias = "isTopic", column = "is_topic", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "is_topic", column = "C")
  private int isTopic;

  @AutoField(alias = "content", column = "content", isRequired = true, length = 2000)
  @ExcelVOAttribute(name = "content", column = "D")
  private String content;

  @AutoField(alias = "userid", column = "userid", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "userid", column = "E")
  private int userid;

  @AutoField(alias = "commentTime", column = "comment_time", isRequired = true, type = "Date")
  @ExcelVOAttribute(name = "comment_time", column = "F")
  private Date commentTime;

  @AutoField(alias = "agreeNum", column = "agree_num", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "agree_num", column = "G")
  private int agreeNum;

  @AutoField(alias = "isAccept", column = "is_accept", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "is_accept", column = "H")
  private int isAccept;


  public int getId() {
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public int getTopicOrCommentId() {
    return topicOrCommentId;
  }
  public void setTopicOrCommentId(int topicOrCommentId){
    this.topicOrCommentId = topicOrCommentId;
  }
  public int getIsTopic() {
    return isTopic;
  }
  public void setIsTopic(int isTopic){
    this.isTopic = isTopic;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content){
    this.content = content;
  }
  public int getUserid() {
    return userid;
  }
  public void setUserid(int userid){
    this.userid = userid;
  }
  public Date getCommentTime() {
    return commentTime;
  }
  public void setCommentTime(Date commentTime){
    this.commentTime = commentTime;
  }
  public int getAgreeNum() {
    return agreeNum;
  }
  public void setAgreeNum(int agreeNum){
    this.agreeNum = agreeNum;
  }
  public int getIsAccept() {
    return isAccept;
  }
  public void setIsAccept(int isAccept){
    this.isAccept = isAccept;
  }
}
