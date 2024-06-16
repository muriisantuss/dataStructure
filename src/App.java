public class App {
    public static void main(String[] args) throws Exception {
        int[] value = { 10, 10, 10 };
        linearList l = new linearList(value, 10);

        System.out.println(l.list[1] + l.nroElem);
    }
}
