package br.edu.ifpr.patterns.interpreter;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class Expression {
   public void interpret(Context context) {
      if (context.getIn().isEmpty()) return;

      if (context.getIn().startsWith(nine())) {
        context.setOut(context.getOut() + (9 * multiplier()));
        context.setIn(context.getIn().substring(2));
      } // if (context.getIn().startsWith(nine()))
      else
         if (context.getIn().startsWith(four())) {
            context.setOut(context.getOut() + (4 * multiplier()));
            context.setIn(context.getIn().substring(2));
         } // if (context.getIn().startsWith(four()))
         else
            if (context.getIn().startsWith(five())) {
               context.setOut(context.getOut() + (5 * multiplier()));
               context.setIn(context.getIn().substring(1));
            } // if (context.getIn().startsWith(five()))

      while (context.getIn().startsWith(one())) {
         context.setOut(context.getOut() + (1 * multiplier()));
         context.setIn(context.getIn().substring(1));
      } // while (context.getIn().startsWith(one()))
   } // public void interpret(Context)

   public abstract String one();
   public abstract String four();
   public abstract String five();
   public abstract String nine();
   public abstract int    multiplier();
} // public abstract class Expression
