package xyz.ashiras.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // JPAのエンティティ(DBとJavaをマッピングしているクラス)
@Table(name = "T_BOOKS") // DBに作成されるテーブル名称
public class Books implements Serializable {

  private static final long serialVersionUID = -7065258559836985729L;

  @Id
  private String name;

  private String comments;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getComments() {
    return this.comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  @Override
  public String toString() {
    return "Books{" + "name=" + name + ", comments=" + comments + '}';
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + Objects.hashCode(this.name);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Books other = (Books) obj;
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    return true;
  }
}
