public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://my_oop/photo.png");
        System.out.println(document.parse());
        Document cachedDocument = new Cashed("gs://my_oop/photo.png");
        System.out.println(cachedDocument.parse());

    }
}