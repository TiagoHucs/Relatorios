package com.example.relatorios;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Gerador {

    public static void gerar(List<Aluno> alunos){
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Planilha1");

        Row headerRow = sheet.createRow(0);
        Cell headerNomeCell = headerRow.createCell(0);
        headerNomeCell.setCellValue("Nome");
        Cell headerNascimentoCell = headerRow.createCell(1);
        headerNascimentoCell.setCellValue("Data Nascimento");
        Cell headerAtivoCell = headerRow.createCell(2);
        headerAtivoCell.setCellValue("Ativo");

        for (Aluno aluno: alunos) {
            Row dataRow = sheet.createRow(alunos.indexOf(aluno) +1);
            Cell nameCell = dataRow.createCell(0);
            nameCell.setCellValue(aluno.getNome());
            Cell dataCell = dataRow.createCell(1);
            dataCell.setCellValue(aluno.getDataNascimentoStr());
            Cell ativoCell = dataRow.createCell(2);
            ativoCell.setCellValue(aluno.getAtivo() ? "SIM" : "NÃO");
        }

        try (FileOutputStream outputStream = new FileOutputStream("arquivo3.xlsx")) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
