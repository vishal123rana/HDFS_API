package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;

public class PUT_API {
    public static void main(String []args) throws IOException{
        String uri = "hdfs://localhost:9000/";
        String local = "/home/vishal/Desktop/Example.txt";
        String hdfsDir = "hdfs://localhost:9000/input";
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(uri),conf);
        fs.copyFromLocalFile(new Path(local),new Path(hdfsDir));
    }
}
