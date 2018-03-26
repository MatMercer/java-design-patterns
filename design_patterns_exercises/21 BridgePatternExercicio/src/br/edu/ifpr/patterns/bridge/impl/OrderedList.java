package br.edu.ifpr.patterns.bridge.impl;

import br.edu.ifpr.patterns.bridge.ListImplementor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class OrderedList implements ListImplementor {
   private List<String> items = new ArrayList<String>();

   @Override
   public void addItem(String item) {}

   @Override
   public void addItem(String item, int position) {}

   @Override
   public void removeItem(String item) {}

   @Override
   public int getNumberOfItems() { return -1; }

   @Override
   public String getItem(int index) { return null; }

   @Override
   public boolean supportsOrdering() { return false; }
} // public class OrderedList implements ListImplementor
