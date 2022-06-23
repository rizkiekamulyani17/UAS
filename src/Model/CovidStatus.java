package Model;

public class CovidStatus {
    private String[] data;
    public CovidStatus(){}
    public String [] getData(){return data;}
    public void setData(String[] data)
    {this.data = data;}
    private int partition(int start, int end){//strat=left dan end=kanan
        String smalll;
        int j,mini;
        String pivot = this.data[end];
        int i = (start - 1);

        for( j = start;j<=end-1;j++){
            if (this.data [j].compareTo(this.data[end])<0){
                i++;
                String t = this.data[i];
                this.data[i] = this.data[j];
                this.data[j]=t;
            }
        }
        String t = this.data[i+1];
        this.data[i+1] = this.data[end];
        this.data[end]=t;
        return (i+1);
    }
    public void quickSart(int start,int end){//recurcive
        if(start<end){
            int p = partition(start, end);
            quickSart(start,p-1) ;
            quickSart(p + 1, end);
        }
    }
    public void printArr(int n){
        int i;
        for(i=0;i<n;i++){
            System.out.println(this.data[i]+" ");
        }
    }
}
