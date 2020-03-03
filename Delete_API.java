package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;

public class Delete_API {
    public static void main(String []args) throws IOException{
        String uri = "hdfs://localhost:9000/input/Example.txt";
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(uri),conf);
        boolean boo = fs.delete(new Path(uri),true);
        System.out.println(boo);
    }
}
