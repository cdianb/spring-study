/**
 * @author mql
 * @date 2023年03月02日 19:30
 */
public class Test {
  public static void main(String[] args) {
    //苹果笔记本
      Computer computer = new noteBook(new Apple());
      computer.info();
    //联想台式机
      Computer computer2 = new deskTop(new Lenovo());
      computer2.info();
  }
}
