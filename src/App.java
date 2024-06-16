public class App {
    public static void main(String[] args) throws Exception {
        linearList l = new linearList();

        l.initializeList();
        l.size(9);
        l.setValues(1);

        int insertionElement = 2024;
        int insertionPosition = 9;
        System.out.println("Inserting element " + insertionElement + " at position " + insertionPosition + ":");
        l.insertionOfElements(insertionElement, insertionPosition);
        System.out.println();

        System.out.println("Current state of the list:");
        l.printList();
        System.out.println();

        System.out.println();
    }
}
