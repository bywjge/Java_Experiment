package Chapter7.Two;

public class Line {
    InputScore one;
    DelScore two;
    ComputerAver three;
    CheckQualified four;
    Line(){
        four=new CheckQualified();
        three=new ComputerAver(four);
        two=new DelScore(three);
        one=new InputScore(two);
    }
    public void givePersonScore(){
        one.inputScore();
    }
}

