#gRPC-IRC
![gRPC IRC](/../screenshoot/screenshoots/server.png?raw=true "gRPC IRC")

a Simple IRC Chat that is implemented by using Protocol Buffers and gRPC

## Introduction
1. [What is Protobuf (Protocol Buffers)?] (https://developers.google.com/protocol-buffers/)
2. [What is gRPC] (http://www.grpc.io/)

This project is an example of IRC like (chatting application) Implementation by using Protobuf and gRPC Technology in Java. This project is based from [grpc-java] (https://github.com/grpc/grpc-java) repository.

## Building Information
In this project, I used RHEL 7 x64 based operating to build and compile the project. I recommend you to do the same because it will be much easier for gradle to find the dependencies for this project by using this OS rather than Windows. So, in order to fully compile this project (including the `proto` files), you will need these:

1. JDK & JRE 1.7+
2. gcc and g++
3. c static library package

If you met all the above requirements you can begin by compiling protobuf. First download protobuf sources in [GitHub] (https://github.com/google/protobuf). It's recommended to download the *released* version in releases tab rather than download the source directly from `main` branch. After downloading the sources, extract it and issue the following command to compile and install it:

```
$ ./configure
$ make
$ make check
$ make install
```

After compiling and installing protobuf, you now have two alternatives:

1. Download grpc-java source, compile it, append this project to it, or
2. Download gRPCIRC sources from a branch called `full_repo`.

If you choose the **first option** your next step is downloading (gRPC implementation in Java)   [https://github.com/grpc/grpc-java]. After downloading it, extract the archieve and build it by issuing the following command:

```
./gradlew build
```

after building completed, download this project from `master` branch, and copy the files into grpc-java folder. After that, issue the following commands:
```bash
cd tugaspat
../gradlew build
../gradlww installDist
```

If you choose the **second option** your next step is downloading this project from `full_repo` branch and compile it bu issuing the following command:
```bash
./gradlew build
cd tugaspat
../gradlew build
../gradlww installDist
```

For **both options**, after issuing the build commands, you will find the compiled binaries in `tugaspat/build` folder. To run the project you can issue the following command (fist, run the server):

```bash
cd tugaspat/build/install/grpc-tugaspat/bin/
./irc-server
```

then run the client:

```
./irc-client
```

