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
  

}
