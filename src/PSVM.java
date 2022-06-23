import Model.CovidStatus;
import network.ConnectURI;
import org.json.JSONArray;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


public class PSVM {
    private ArrayList<CovidStatus> getProductsData() throws IOException {
        URL sMe = ConnectURI.buildURL("https://vaccovid.coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/npm-covid-data/asia");
        String productsResponse = ConnectURI.getResponseFormHttpUrl(sMe);
        assert productsResponse != null;
        JSONArray productsJSONArray = new JSONArray(productsResponse);
        ArrayList<CovidStatus> productList = new ArrayList<>();
        for(int index = 0;index<productsJSONArray.length();index++){
            CovidStatus productsModel = new CovidStatus();
            productList.add(productsModel);
        }
        return productList;
    }
    public static void main(String[] args) throws IOException {

        String []data ={};
        int n = data.length;
        System.out.println("\nBefore sorting array elements are -s");CovidStatus _myQS = new CovidStatus();
        _myQS.setData(data);
        _myQS.printArr(n);
        _myQS.quickSart(0,n-1);
        System.out.println("\nAfter sorting array elements are - " );
        _myQS.printArr(n);
        System.out.println();
//    public static void main(String[] args) {
//       String[] data = {"s","a","b","c","g","z","d"};
//       int n = data.length;
////        System.out.println("\nBefore sorting array elements are -s");
//        CovidStatus _myQS = new CovidStatus();
//        _myQS.setData(data);
//        _myQS.printArr(n);
//        _myQS.quickSart(0,n-1);
//        System.out.println("\nAfter sorting array elements are - " );
//        _myQS.printArr(n);
//        System.out.println();
//    }


}}
