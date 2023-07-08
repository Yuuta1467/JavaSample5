package problem7;

public class Data {
	
//  メンバ変数number
    private int number = 0;
    
    private String comment = "";
    
    public Data(String comment) {
    	this.comment = comment;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public int getNumber() {
    	return this.number;
    }
    //  メンバ変数comment
    
    public String getComment() {
    	return this.comment;
    }

}
