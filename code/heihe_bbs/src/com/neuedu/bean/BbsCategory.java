package com.neuedu.bean;
import java.util.*;
import com.tgb.lk.annotation.*;

@AutoBean(alias = "BbsCategory",table="tab_bbs_category")
public class BbsCategory {

  @AutoField(alias = "���", column = "id", isKey = true , isRequired = true , type="Integer", length=0)
  @ExcelVOAttribute(name = "id", column = "A")
  private int id;

  @AutoField(alias = "nickname", column = "nickname", isRequired = true, length = 100)
  @ExcelVOAttribute(name = "nickname", column = "B")
  private String nickname;


  public int getId() {
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname){
    this.nickname = nickname;
  }
}

