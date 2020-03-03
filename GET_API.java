package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;

public class GET_API {
    public static void main(String []args) throws IOException{
        String uri = "hdfs://localhost:9000/";
        String local = "/home/vishal/";
        String hdfsDir = "hdfs://localhost:9000/input/Example.txt";
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(uri),conf);
        fs.copyToLocalFile(new Path(hdfsDir),new Path(local));
    }
}
