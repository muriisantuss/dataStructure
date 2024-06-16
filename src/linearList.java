public class linearList {
  private int[] list = new int[10];
  private int nroElem;

  public linearList() {
  }

  public linearList(int[] list, int nroElem) {
    this.list = list;
    this.nroElem = nroElem;
  }

  void initializeList() {
    this.nroElem = 0;
  }

  void size(int l) {
    this.nroElem = l;
  }

  void setValues(int number) {
    for (int i = 0; i < this.nroElem; i++) {
      list[i] = number = number * 2;
    }
  }

  void printList() {
    for (int i = 0; i < this.nroElem; i++) {
      System.out.println("List: " + list[i]);
    }
  }
}
