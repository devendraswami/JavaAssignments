1. What is Input Output Stream in java? 

Answer- 

Stream in java is reffered as Sequence of data. Input Stream is used to read data from the source 
 and Ouput Stream is used to Write the data to destination. 


 2. What are the methods of Output Stream? 

 Answer- 
  write() - writes the specified byte to the output stream
 write(byte[] array) - writes the bytes from the specified array to the output stream
flush() - forces to write all data present in the output stream to the destination
 close() - closes the output stream.


 3. What is serialization in Java?

Answer- 

Serialization is the process of converting an object into a stream of bytes to transfer it over a network or to
store it in a file or database. In Java, serialization is done by implementing the Serializable interface. Serialization
Proctects the data from hacker. It changes the data in a form that humans can'nt understand. 




4. What is the Serializable interface in Java?


Ans: The Serializable interface in Java is a marker interface that has no methods. It is used to mark classes that
can be serialized.




5. What is deserialization in Java?

Ans: Deserialization is the process of converting a stream of bytes back into an object instance. This is done
after an object has been serialized.




6. How is serialization achieved in Java?

Ans: Serialization is achieved in Java by implementing the Serializable interface. When an object is serialized, its
state is converted into a stream of bytes, which can then be transferred over a network or stored in a file or
database.




7. How is deserialization achieved in Java?


Ans: Deserialization is achieved in Java by reading a stream of bytes and using them to recreate the original
object instance. This is done by calling the readObject() method.




8. How can you avoid certain member variables of class from getting Serialized?

Ans: Mark member variables as static or transient, and those member variables will no more be a part of
Serialization.



9. What classes are available in the Java IO File Classes API?

Ans: The following classes are available in the Java IO API -
File
FileInputStream
FileReader
FileWriter


10.  What is Difference between Externalizable and Serialization interface ?

Ans: 
Serializable interface - It is a markUp interface. And it doesn't have any methods. It provides its own Serialization
process. We just need to implement Serializable interface.


Externalizable interface - It is not a markup interface. It has its own methods writeExternal() and readExternal().
We need to override writeExternal and readExternal methods to complete Serialization. 