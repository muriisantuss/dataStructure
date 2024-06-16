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

  boolean insertionOfElements(int reg, int i) {
    if (this.nroElem == list.length || i < 0 || i > this.nroElem) {
      System.out.println("Fill");
      return false;
    }
    for (int j = this.nroElem; j > i; j--)
      list[j] = list[j - 1];
    {
      list[i] = reg;
      nroElem++;
      System.out.println("Value: " + list[i]);
      return true;
    }
  }

}
