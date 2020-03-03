package org.example;

import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.Configuration;
import java.io.IOException;
import java.net.URI;

public class List_Directory_API {
    public static  void main(String []args) throws IOException{
        String uri = "hdfs://localhost:9000/";
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(uri),conf);
        FileStatus[] filse = fs.listStatus(new Path(uri));
        for(FileStatus file: filse){
            System.out.println(file.getReplication());
        }
    }
}
