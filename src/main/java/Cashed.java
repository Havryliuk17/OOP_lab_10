public class Cashed implements Document{
    private String gcsPath;
    private Connection connection;

    public Cashed(String gcsPath) {
        this.gcsPath = gcsPath;
        connection = Connection.getInstance();
    }


    @Override
    public String parse() {
        String res = connection.searchQuery("SELECT from cachedDoc  = '"  + gcsPath + "'");
        if(res!=null){
            return res;
        }else{
            SmartDocument smartDocument = new SmartDocument(gcsPath);
            String text = smartDocument.parse();
            String sql = "INSERT INTO  ('" + gcsPath + "', '" + text + "')";
            connection.executeQuery(sql);
            return text;
        }
    }
}