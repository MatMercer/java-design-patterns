package br.edu.ifpr.patterns.facade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class DataFacade {
   private Calendar         cal = Calendar.getInstance();
   private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

   public DataFacade(String data) throws ParseException {
      Date d = sdf.parse(data);
      cal.setTime(d);
   } // public DataFacade(String) throws ParseException

   public void add(int dias) { cal.add(Calendar.DAY_OF_MONTH,dias); }

   public void subtract(int dias) { add(dias * -1); }
   
   @Override
   public String toString() { return sdf.format(cal.getTime()); }
} // public class DataFacade
