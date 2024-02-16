package kalkulator;
public class Proses_kalkulator {
    int operator = 0;
    double angka1,angka2,angka3,result;
    String process;
    
    public void setNumber(String opt) {
        if(!opt.equals("")){
            if(operator==0){
                angka1 = Double.valueOf(opt);
            }else{
                angka2 = Double.valueOf(opt);
            }
        }
    }
    public void setOperator(int operator){
        this.operator = operator;
    }
    public double getResult(){
        return result;
    }
    public void setResult(double hasil){
        this.result = hasil;
    }
    public void process(){
        switch(operator){
            case 1:
                result = angka1 + angka2;
                process = "+";
                break;
            case 2:
                result = angka1 - angka2;
                process = "-";
                break;
            case 3:
                result = angka1 * angka2;
                process = "*";
                break;
            case 4:
                result = angka1 / angka2;
                process = "/";
                break;
            case 5:
                result = (angka1)/100;
                process = "%";
                break;
            case 6:
                result = Math.sqrt(angka1);
                process = "√";
                break;
            case 7:
                result = Math.pow(angka1, 2);
                process = "X²";
                break;    
        }
        angka3 = angka1;
        angka1 = result;
    }
}
