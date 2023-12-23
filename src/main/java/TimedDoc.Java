import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TimedDoc implements Document {
    private String gcsPath;
    @Override
    public String parse() {
        CachedDocument cachedDocument = new Cashed(gcsPath);
        SmartDocument smartDocument = new SmartDocument(gcsPath);

        long startTime = System.nanoTime();
        String smart_res = smartDocument.parse();
        long stopTime = System.nanoTime();
        System.out.println("Time taken for parsing via SmartDocument : ");
        System.out.println(stopTime-startTime);

        startTime = System.nanoTime();
        String res = cachedDocument.parse();
        stopTime = System.nanoTime();
        System.out.println("Time taken for parsing via CachedDocument : ");
        System.out.println(stopTime-startTime);
        return res;
    }
}