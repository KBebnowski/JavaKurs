package Collections11_ImplementingIterableAndDownloadingWebPages;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary2 implements Iterable<String>{

    private LinkedList<String> urls2 = new LinkedList<>();

    private class UrlIterator implements Iterator<String>{

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index<urls2.size();//hasNext zwraca true jesli index jest mniejszy od dlugosci listy urls2, jesli zwroci false bedzie znaczylo ze nie ma wiecej stron
        }

        @Override
        public String next() {
            //bedziemy zwracac kod html ze stron
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(urls2.get(index));
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = null;
                while((line=br.readLine())!=null){
                    sb.append(line);
                    sb.append("\n");
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            index++;
            return sb.toString();
        }

        @Override
        public void remove() {
            urls2.remove(index);
        }
    }


    public UrlLibrary2() {
        urls2.add("http://www.facebook.com");
        urls2.add("http://www.pudelek.pl");
        urls2.add("http://www.meczyki.pl");
    }


    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }
}
