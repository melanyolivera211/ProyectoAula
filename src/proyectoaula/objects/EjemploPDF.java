package proyectoaula.objects;


import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EjemploPDF {

    public void prueba() {
        // step 1: creation of a document-object        
        Document document = new Document();

        try {
            // step 2: creation of the writer
            PdfWriter writer = PdfWriter.getInstance(document, 
                    new FileOutputStream("Ejemplo_pdf_java.pdf"));

            // step 3: we open the document
            document.open();
            
            // step 4: we grab the ContentByte and do some stuff with it
            PdfContentByte cb = writer.getDirectContent();
            Graphics g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());

            //--------------------- pagina 1 --------------------------
            g.setColor(Color.red);
            g.drawRect(1, 1, 593, 790);    
            
            g.setColor(new Color(154, 171, 237));
            g.fillOval(290, 90, 280, 100);
                        
            Font font1 = new Font("Tahoma", Font.BOLD + Font.ITALIC, 35);
            g.setFont(font1);

            g.setColor(Color.RED);
            g.drawString("Ejemplo crear PDF desde Java", 40, 150);
            
            g.setColor(Color.WHITE);
            g.drawString("PDF desde Java", 290, 150);
            
            ImageIcon img1 = new ImageIcon(getClass().getResource("imagenes/play_list_youtube-GUI_Java.jpg"));
            g.drawImage(img1.getImage(), 200, 250, 200, 200, null);
            
            Font font2 = new Font("Tahoma", Font.PLAIN, 15);
            g.setFont(font2);
            g.setColor(Color.BLACK);
            g.drawString("Escanea el código QR para visitar la lista de reproducción de YouTube", 60, 460);
            g.drawString("del curso de GUI en Java", 210, 480);
            
            document.newPage();
            //--------------------- pagina 2 --------------------------
            
            g.setColor(Color.GREEN);
            g.drawLine(1, 1, 200, 200);

            g.setColor(Color.BLUE);
            g.drawRect(200, 200, 300, 300);
            
            ImageIcon img2 = new ImageIcon(getClass().getResource("imagenes/java-duke-guitar.png"));
            g.drawImage(img2.getImage(), 230, 220, 250, 250, null);
            
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

        // step 5: we close the document
        document.close();

        JOptionPane.showMessageDialog(null, 
                "Se creo el archivo 'Ejemplo_pdf_java.pdf' en la carpeta del proyecto");
    }

    public static void main(String[] args) {
        EjemploPDF obj = new EjemploPDF();
        obj.prueba();
    }
}
