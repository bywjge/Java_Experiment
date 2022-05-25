package Chapter12.One;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Objects;

public class AnalysisResult {
    public static void main(String[] args) throws URISyntaxException {
        File fRead = new File(Objects.requireNonNull(AnalysisResult.class.getResource("score.txt")).toURI());
        try {
            Writer out = new FileWriter("scoreAnalysis.txt");//以尾加方式创建指向文件fWrite的out流
//            Writer out = new FileWriter(AnalysisResult.class.getResource(".").toURI() + "scoreAnalysis.txt", true);//以尾加方式创建指向文件fWrite的out流
//            Writer out = new FileWriter(Objects.requireNonNull(AnalysisResult.class.getResource(".")) + "scoreAnalysis.txt");//以尾加方式创建指向文件fWrite的out流
            BufferedWriter bufferWrite = new BufferedWriter(out);//创建指向out的bufferWrite流
            Reader in = new FileReader(fRead);//创建指向文件fRead的in流
            BufferedReader bufferRead = new BufferedReader(in);//创建指向in的bufferRead流
            String str;
            while((str=bufferRead.readLine())!=null) {
                double totalScore=Fenxi.getTotalScore(str);
                str = str+"总成绩:"+totalScore;
                System.out.println(str);
                bufferWrite.write(str);
                bufferWrite.newLine();
            }
            bufferRead.close();
            bufferWrite.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }

}
