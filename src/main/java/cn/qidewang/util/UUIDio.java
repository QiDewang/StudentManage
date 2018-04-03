package cn.qidewang.util;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

public class UUIDio {

    public static void doExcel(){

        Integer rows = 1868;


        String filepath = "C:\\Users\\78692\\Desktop\\用户信息注册.xls";

        try {

            FileInputStream is = new FileInputStream(filepath);
            //创建输出文件
            File file = new File(filepath);
            //创建一个模板workbook
            Workbook workbook = Workbook.getWorkbook(is);

            //创建一个可写的workbook,将模板导入
            WritableWorkbook writableWorkbook = Workbook.createWorkbook(file,workbook);

            WritableSheet writableSheet = writableWorkbook.getSheet(0);

            for(int i =0;i < rows; i++){
                //创建一行
                Label label = new Label(0,i,UUID.randomUUID().toString().replaceAll("-",""));

                writableSheet.addCell(label);
            }
            writableWorkbook.write();
            writableWorkbook.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (RowsExceededException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }

    }


}
