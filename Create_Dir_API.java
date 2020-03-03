package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;

public class Create_Dir_API {
    public static void main(String []args) throws IOException{
        //this is your hdfs path and input is folder 
        String uri = "hdfs://localhost:9000/input";
        Configuration conf = new Configuration();
        
        FileSystem fs = FileSystem.get(URI.create(uri),conf); //File System object
        boolean yesorno = fs.mkdirs(new Path(uri));
        System.out.println(yesorno);

    }
}
