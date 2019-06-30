# Protocol Buffer(简称 Protobuf) 

用于序列化

本文参考
https://www.cnblogs.com/songfy/p/4732560.html


发现序列化的时候，需要Model.Student.parseFrom(...)【某个具体类.parseFrom(...)】

所以反序列化之前，需要知道这个是属于哪个类