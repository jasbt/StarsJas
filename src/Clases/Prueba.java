package Clases;
/*
correo: omnitracs@supertrack.mx
clave: (bkuY(W&k)]L

servidor entrada: vps.supertrack.mx
puerto: 995
SSL activo

servidor salida: vps.supertrack.mx
puerto: 465
SSL activo
*/
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class Prueba {
       
    public void Prueba  (ArrayList row, String[] Nombre, double[] MT, String[] folio, String[] uuid, double[] total, String[] ncb, String[] banco, double m, double to, String[] mtod, String F, String [] NE, String user) {   
        ArrayList NCB = new ArrayList();
        String email = "";
        Connection reg = ConexionEDI.GetConnection();    
 
        if ( !MT.equals("") && !folio.equals("") && !uuid.equals("") && !total.equals("") || !banco[0].equals("Vacio") && ncb[0].equals("Vacio")) {
            try {
                Properties Pros = new Properties();

                String cadena = "";
                ArrayList<String> em = new ArrayList();
                ArrayList f = new ArrayList();
                ArrayList fol = new ArrayList();
                ArrayList valor = new ArrayList();
                double montot = 0;
                double monto = 0;
                int j = 0;
                double tot=to;
                String correos = "";
                 
                if (!Nombre.equals("")&& !row.equals("") ) {
                    Pros.setProperty("mail.smtp.host", "vps.supertrack.mx");
                    Pros.setProperty("mail.smtp.starttls.enable", "true");
                    Pros.setProperty("mail.smtp.port", "587");
                    Pros.setProperty("mail.smtp.auth", "true");
/*
servidor entrada: vps.supertrack.mx
puerto: 995
SSL activo
https://www.youtube.com/watch?v=Dj1t53SH7nk
servidor salida: vps.supertrack.mx
puerto: 465
SSL activo
*/
                    Session session = Session.getDefaultInstance(Pros);
                    String CorreoRemitente = "complementodepagos@supertrack.mx";
                    String password = "h{NJYS&I9SWS";
                    MimeMessage message = new MimeMessage(session);
                    BodyPart Mesages = new MimeBodyPart();
                    int k=0;                  
                       
                    try {
                       do{
                       
                        Statement s = reg.createStatement();
                        ResultSet r;
                        r = s.executeQuery(
                                "	 SELECT EMITIDO,FOLIO,email,Folio FROM  vERP_APLICACION_CORREO WHERE  CLIENTE_NOMBRE = '"+Nombre[0]+"' and uuid='"+uuid[k]+"' and num_ref!='' "
                        );
                        while (r.next()) {
                            email = (r.getString("email"));
                            f.add(r.getString("FOLIO"));
                            em.add(r.getString("EMITIDO"));
                        }
                         
                        if(NE[k].equals("ENVIADO")) {                              
                                 int resp2 = JOptionPane.showConfirmDialog(null, "¡este UUID ya fue emitido! '"+uuid[k]+"'\n     ¿Esta seguro de volver a emitirlo? ", "Alerta!", JOptionPane.YES_NO_OPTION);
                              if(resp2==0){
                                 valor.add("<tr><th>" + folio[k] + "</th>"
                                    + "<th style=\"text-align: center;\">"
                                    + uuid[k] + "</th>"
                                    + "<th>" + MT[k] + "</th>"
                                    + "<th>" + total[k] + "</th>"
                                    + "<th>" + mtod[k] + "</th></tr>");
                                  fol.add(uuid[k]);
                                  
                              }else{
                                 tot= tot-total[k];
                                 m=m-MT[k]; 
                              }
                               
                          }else if(NE[k].equals("NO ENVIADO")){
                              valor.add("<tr><th>" + folio[k] + "</th>"
                                    + "<th style=\"text-align: center;\">"+ uuid[k] + "</th>"
                                    + "<th>" + MT[k] + "</th>"
                                    + "<th>" + total[k] + "</th>"
                                    + "<th>" + mtod[k] + "</th></tr>");
                                fol.add(uuid[k]);
                          }
                        
                          k++;
                       System.out.println("jbt "+k+"   "+row.size());
                   }while(k<row.size());
                        String valor1 = (String) valor.toString().replace("[", "").replace("]", "").replace(",", " ");
                        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de enviar el correo? ", "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 0 && !valor1.equals("")) {
                            Mesages.setContent("<!DOCTYPE html>"
                                    + "<html>"
                                    + "	<head>"
                                    + "		<style>"
                                    + "		table, th, td {"
                                    + "		text-align: left;"
                                    + "		}"
                                    + "		#idback{"
                                    + "			background-color: #969696;"
                                    + "			border: .5px solid #000000;"
                                    + "		}"
                                    + "		#idba{"
                                    + "			background-color: #E8E8E7;"
                                    + "		}"
                                    + "		body{"
                                    + "			font-family: arial;"
                                    + "		}"
                                    + "		table{"
                                    + "			width: 60%;"
                                    + "			height: 100%;"
                                    + "                 font-size: .8em;"
                                    + "		}"
                                    + "		h2{"
                                    + "		background: white;"
                                    + "		}"
                                    + "		</style>"
                                    + "	</head>"
                                    + "	<body>"
                                    + "		<center>"
                                    + "		<p>"
                                    + "			<b style=\"font-size: 18px\">Recordatorio para la Emision de Comprobante de Pago</b>"
                                    + "			<table >"
                                    + "				<tr>"
                                    + "					<td id=\"idback\" ></td>"
                                    + "					<td id=\"idback\" style=\"text-align: center;\"><b>DETALLES DEL PAGO</b></td>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >PROOVEDOR</th>"
                                    + "					<th >" + Nombre[0] + "</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >TOTAL</th>"
                                    + "					<th >" + tot + "</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >CUENTA</th>"
                                    + "					<th >" + ncb[0] + "</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >Banco</th>"
                                    + "					<th >" + banco[0] + "</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >Fecha De Pago</th>"
                                    + "					<th >" + F + "</th>"
                                    + "				</tr>"
                                    + "				"
                                    + "			</table>"
                                    + "			<br>"
                                    + "                 <b style=\"font-size: 18px\">Facturas Pagadas</b>"
                                    + "			<table >"
                                    + "                         <tr>"
                                    + "					<td id=\"idback\" ><b>FOLIO</b></td>"
                                    + "					<td id=\"idback\" style=\"text-align: center;\"><b>UUID</b></td>"
                                    + "					<td id=\"idback\"><b>MONTO APLICADO</b></td>"
                                    + "                                 <td id=\"idback\"><b>TOTAL</b></td>"
                                    + "                                 <td id=\"idback\"><b>Metodo de Pago</b></td>       "
                                    + "				</tr>"
                                    + valor1
                                    + "                          <tr>"
                                    + "				    <td id=\"idback\"></td>"
                                    + "                             <td id=\"idback\" style=\"text-align: right;\"><b>TOTAL</b></td>"
                                    + "				    <td id=\"idback\"><b>" + m + "</b></td>"
                                    + "				    <td id=\"idback\"><b>" + tot + "</b></td>"
                                    + "                             <td id=\"idback\"></td>"
                                    + "				</tr>"
                                    + "			</table>"
                                    + "			<br>"
                                    + "			<b style=\"font-size: 18px\">Datos para Emision de Complemento de Pago</b>"
                                    + "			<table>"
                                    + "				<tr>"
                                    + "					<th id=\"idback\">Razon Social</th>"
                                    + "					<th id=\"idback\" style='text-align: center;'>SuperTrack S.A. DE C.V.</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>R.F.C.</th>"
                                    + "					<th>SUP030218J61</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>DIRECCION FISCAL</th>"
                                    + "					<th>Carretera HUEJOTZINGO Aeropuerto KM 0+0.27, Cuarto Barrio, Huejotzingo, Puebla, C.P. 74160 </th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th><b>METODO DE PAGO</b></th>"
                                    + "					<th>Debera ser \"PPD\"(Pago en pacialidades o diferido) </th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>FORMA DE PAGO</th>\n"
                                    + "					<th>Debera ser \"02\"(Cheque nominativo), \"03\"(Transferencia Electronica), segun corresponda </th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>MONEDA</th>"
                                    + "					<th>\"MXN\"(Peso Mexicano)</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>NOMBRE DEL BANCO EMISOR DEL PAGO</th>"
                                    + "					<th>Banco Nacional de Mexico, S.A.</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>No. DE CUENTA DEL BANCO EMISOR DE PAGO</th>"
                                    + "					<th>833-658-6047</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>CLAVE INTERBANCARIA</th>"
                                    + "					<th>002164083365860477</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>RFC DEL BANCO EMISOR DEL PAGO</th>"
                                    + "					<th>BNM840515VB1</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>ENVIAR COMPLEMENTO A</th>"
                                    + "					<th><b style=\"font-size: 14px\">complementodepagos@supertrack.mx</b></th>"
                                    + "				</tr>"
                                    + "			</table>"
                                    + "		</p>"
                                    + "		</center>"
                                    + "	</body>"
                                    + "</html>", "text/html"
                            );
                          
                            String correoReceptor = email;
                            String asunto = "Solicitud de Complemento de Pago";
                            message.setFrom(new InternetAddress(CorreoRemitente));
                       
                            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                            message.setSubject(asunto);
                            MimeMultipart multiPart = new MimeMultipart();
                            multiPart.addBodyPart(Mesages);

                            message.setContent(multiPart);

                            Transport t = session.getTransport("smtp");
                            t.connect(CorreoRemitente, password);
                            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                            t.close();
                            j++;
                            for (int i = 0; i < fol.size(); i++) {
                                try {
                                    Statement s2 = reg.createStatement();
                                    ResultSet r2;
                                    r2 = s2.executeQuery("UPDATE ERP_APLICACION_CORREO SET EMITIDO=0, FCH_EMISION=GETDATE(),usuario='"+user.toUpperCase()+"' WHERE uuid='" + fol.get(i) + "'");
                                    // r2 = s2.executeQuery("UPDATE ERP_APLICACION_CORREO SET EMITIDO=0, FCH_EMISION=GETDATE() WHERE uuid='" + fol.get(i) + "'");
                                } catch (SQLException e) {
                                    System.out.println(e);
                                }
                            }
                               JOptionPane.showMessageDialog(null, "El correo se ha enviado correctamente","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "El correo no emitido","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                }              
            } catch (AddressException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error al enviar correo datos vacios","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            } catch (MessagingException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El correo no fue enviado \n NCB:"+ncb[0]+" Banco: "+banco[0],"Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
/*        (ArrayList row, String[] Nombre, double[] MT, String[] folio, String[] uuid, double[] total, String[] ncb, String[] banco, double m, double to, String[] mtod, String F, String [] NE) {
        ArrayList NCB = new ArrayList();
         String email = "";
         Connection reg = ConexionEDI.GetConnection();
    
 
        if ( !MT.equals("") && !folio.equals("") && !uuid.equals("") && !total.equals("") || !banco[0].equals("Vacio") && ncb[0].equals("Vacio")) {
            try {
                Properties Pros = new Properties();

                String cadena = "";
                //for (int i = 1; i < email.size(); i++) {

                ArrayList<String> em = new ArrayList();
                ArrayList f = new ArrayList();
                ArrayList fol = new ArrayList();
                 ArrayList valor = new ArrayList();
                double montot = 0;
                double monto = 0;
                int j = 0;
                double tot=to;
                String correos = "";
               
                 
                if (!Nombre.equals("")&& !row.equals("") ) {
                    Pros.setProperty("mail.smtp.host", "vps.supertrack.mx");
                    Pros.setProperty("mail.smtp.starttls.enable", "true");
                    Pros.setProperty("mail.smtp.port", "587");
                    Pros.setProperty("mail.smtp.auth", "true");

                    Session session = Session.getDefaultInstance(Pros);
                    String CorreoRemitente = "omnitracs@supertrack.mx";
                    String password = "(bkuY(W&k)]L";
                    MimeMessage message = new MimeMessage(session);
                    BodyPart Mesages = new MimeBodyPart();
                    int k=0;
                  
                       
                    try {
                       do{
                       

                        Statement s = reg.createStatement();

                        ResultSet r;
                           
                        r = s.executeQuery(
                                "	 SELECT EMITIDO,FOLIO,email,Folio FROM  vERP_APLICACION_CORREO WHERE  CLIENTE_NOMBRE = '"+Nombre[0]+"' and uuid='"+uuid[k]+"' and num_ref!='' "
                        );
                        while (r.next()) {

                            email = (r.getString("email"));
                            f.add(r.getString("FOLIO"));
                            em.add(r.getString("EMITIDO"));
                        }
                         
                       

                       
                            
                          if(NE[k].equals("ENVIADO")) {
                              
                                 int resp2 = JOptionPane.showConfirmDialog(null, "¡este UUID ya fue emitido! '"+uuid[k]+"'\n     ¿Esta seguro de volver a emitirlo? ", "Alerta!", JOptionPane.YES_NO_OPTION);
                              if(resp2==0){
                                 valor.add("<tr><th>" + folio[k] + "</th>"
                                    + "<th style=\"text-align: center;\">"
                                    + uuid[k] + "</th>"
                                    + "<th>" + MT[k] + "</th>"
                                    + "<th>" + total[k] + "</th>"
                                    + "<th>" + mtod[k] + "</th></tr>");
                                  fol.add(uuid[k]);
                                  
                              }else{
                                 tot= tot-total[k];
                                 m=m-MT[k]; 
                              }
                               
                          }else if(NE[k].equals("NO ENVIADO")){
                              valor.add("<tr><th>" + folio[k] + "</th>"
                                    + "<th style=\"text-align: center;\">"+ uuid[k] + "</th>"
                                    + "<th>" + MT[k] + "</th>"
                                    + "<th>" + total[k] + "</th>"
                                    + "<th>" + mtod[k] + "</th></tr>");
                                fol.add(uuid[k]);
                          }
                        
                          k++;
                       System.out.println(k+"   "+row.size());
                   }while(k<row.size());
                        String valor1 = (String) valor.toString().replace("[", "").replace("]", "").replace(",", " ");
                        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de enviar el correo? ", "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 0 && !valor1.equals("")) {
                            Mesages.setContent("<!DOCTYPE html>"
                                    + "<html>"
                                    + "	<head>"
                                    + "		<style>"
                                    + "		table, th, td {"
                                    + "		text-align: left;"
                                    + "		}"
                                    + "		#idback{"
                                    + "			background-color: #969696;"
                                    + "			border: .5px solid #000000;"
                                    + "		}"
                                    + "		#idba{"
                                    + "			background-color: #E8E8E7;"
                                    + "		}"
                                    + "		body{"
                                    + "			font-family: arial;"
                                    + "		}"
                                    + "		table{"
                                    + "			width: 60%;"
                                    + "			height: 100%;"
                                    + "                 font-size: .8em;"
                                    + "		}"
                                    + "		h2{"
                                    + "		background: white;"
                                    + "		}"
                                    + "		</style>"
                                    + "	</head>"
                                    + "	<body>"
                                    + "		<center>"
                                    + "		<p>"
                                    + "			<b style=\"font-size: 18px\">Recordatorio para la Emision de Comprobante de Pago</b>"
                                    + "			<table >"
                                    + "				<tr>"
                                    + "					<td id=\"idback\" ></td>"
                                    + "					<td id=\"idback\" style=\"text-align: center;\"><b>DETALLES DEL PAGO</b></td>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >PROOVEDOR</th>"
                                    + "					<th >" + Nombre[0] + "</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >TOTAL</th>"
                                    + "					<th >" + tot + "</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >CUENTA</th>"
                                    + "					<th >" + ncb[0] + "</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >Banco</th>"
                                    + "					<th >" + banco[0] + "</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th >Fecha De Pago</th>"
                                    + "					<th >" + F + "</th>"
                                    + "				</tr>"
                                    + "				"
                                    + "			</table>"
                                    + "			<br>"
                                    + "                 <b style=\"font-size: 18px\">Facturas Pagadas</b>"
                                    + "			<table >"
                                    + "                         <tr>"
                                    + "					<td id=\"idback\" ><b>FOLIO</b></td>"
                                    + "					<td id=\"idback\" style=\"text-align: center;\"><b>UUID</b></td>"
                                    + "					<td id=\"idback\"><b>MONTO APLICADO</b></td>"
                                    + "                                 <td id=\"idback\"><b>TOTAL</b></td>"
                                    + "                                 <td id=\"idback\"><b>Metodo de Pago</b></td>       "
                                    + "				</tr>"
                                    + valor1
                                    + "                          <tr>"
                                    + "				    <td id=\"idback\"></td>"
                                    + "                             <td id=\"idback\" style=\"text-align: right;\"><b>TOTAL</b></td>"
                                    + "				    <td id=\"idback\"><b>" + m + "</b></td>"
                                    + "				    <td id=\"idback\"><b>" + tot + "</b></td>"
                                    + "                             <td id=\"idback\"></td>"
                                    + "				</tr>"
                                    + "			</table>"
                                    + "			<br>"
                                    + "			<b style=\"font-size: 18px\">Datos para Emision de Complemento de Pago</b>"
                                    + "			<table>"
                                    + "				<tr>"
                                    + "					<th id=\"idback\">Razon Social</th>"
                                    + "					<th id=\"idback\" style='text-align: center;'>SuperTrack S.A. DE C.V.</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>R.F.C.</th>"
                                    + "					<th>SUP030218J61</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>DIRECCION FISCAL</th>"
                                    + "					<th>Carretera HUEJOTZINGO Aeropuerto KM 0+0.27, Cuarto Barrio, Huejotzingo, Puebla, C.P. 74160 </th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th><b>METODO DE PAGO</b></th>"
                                    + "					<th>Debera ser \"PPD\"(Pago en pacialidades o diferido) </th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>FORMA DE PAGO</th>\n"
                                    + "					<th>Debera ser \"02\"(Cheque nominativo), \"03\"(Transferencia Electronica), segun corresponda </th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>MONEDA</th>"
                                    + "					<th>\"MXN\"(Peso Mexicano)</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>NOMBRE DEL BANCO EMISOR DEL PAGO</th>"
                                    + "					<th>Banco Nacional de Mexico, S.A.</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>No. DE CUENTA DEL BANCO EMISOR DE PAGO</th>"
                                    + "					<th>833-658-6047</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>CLAVE INTERBANCARIA</th>"
                                    + "					<th>002164083365860477</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>RFC DEL BANCO EMISOR DEL PAGO</th>"
                                    + "					<th>BNM840515VB1</th>"
                                    + "				</tr>"
                                    + "				<tr>"
                                    + "					<th>ENVIAR COMPLEMENTO A</th>"
                                    + "					<th><b style=\"font-size: 14px\">complementodepagos@supertrack.mx</b></th>"
                                    + "				</tr>"
                                    + "			</table>"
                                    + "		</p>"
                                    + "		</center>"
                                    + "	</body>"
                                    + "</html>", "text/html"
                            );
                          
                            String correoReceptor = email;
                            String asunto = "Solicitud de Complemento de Pago";
                            message.setFrom(new InternetAddress(CorreoRemitente));
                       
                            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                            message.setSubject(asunto);
                            MimeMultipart multiPart = new MimeMultipart();
                            multiPart.addBodyPart(Mesages);

                            message.setContent(multiPart);

                            Transport t = session.getTransport("smtp");
                            t.connect(CorreoRemitente, password);
                            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                            t.close();
                            j++;
                            for (int i = 0; i < fol.size(); i++) {
                                try {
                                    Statement s2 = reg.createStatement();

                                    ResultSet r2;

                                    r2 = s2.executeQuery("UPDATE ERP_APLICACION_CORREO SET EMITIDO=0, FCH_EMISION=GETDATE() WHERE uuid='" + fol.get(i) + "'");
                                } catch (SQLException e) {
                                    System.out.println(e);
                                }

                            }
                               JOptionPane.showMessageDialog(null, "El correo se ha enviado correctamente");
                        }else{
                            JOptionPane.showMessageDialog(null, "El correo no se envió");
                        }

                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                      
                   
                  
                }
              
            } catch (AddressException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error al enviar correo datos vacios");
            } catch (MessagingException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "El correo no fue enviado \n NCB:"+ncb[0]+" Banco: "+banco[0]);
        }

    }
}
*/

