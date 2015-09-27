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

If you choose the **first option** your next step is downloading [gRPC implementation in Java] (https://github.com/grpc/grpc-java). After downloading it, extract the archieve and build it by issuing the following command:

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

That's it!

## Pre-built binaries
Pre-built binaries can be found in `built-binaries` folder in project root folder. There are two scripts that can be used to easily run the program:

1. `grpc-tugaspat/bin/irc-client` for client program
2. `grpc-tugaspat/bin/irc-server` for server program

## Running

You will find the compiled binaries in `tugaspat/build/install/grpc-tugaspat/bin/` folder (or in `built-binaries/gprc-tugaspat/bin` folder if you didn't compile the project). To run the server you can issue the following command:

```bash
./irc-server
```

And to run the client, issue the following command:

```
./irc-client
```

## Tests and Execution Results
I have performed several tests, here are the results:

### Server Execution
![gRPC IRC](/../screenshoot/screenshoots/server.png?raw=true "gRPC IRC")

### Two Clients Test
![gRPC Two clients](/../screenshoot/screenshoots/twoclients.png?raw=true "gRPC Two clients")

**Scenario:**

1. First client connected to server and picked a nickname.
2. Second client then joined to the server and picked a nickname.
3. Both client then joined *#IF-ITB*.
4. First client sent a message to all channel that he joined.
5. Second client received the message because he had joined *#IF-ITB*.

### Leave Channel Test
![gRPC Leave](/../screenshoot/screenshoots/leavetest.png?raw=true "gRPC Leave")

**Scenario:**

1. Second client leaved *#IF-ITB*
2. First client sent messages to all channel
3. Second client didn't receive the message as he had left #IF-ITB

### Three clients
![gRPC Three clients](/../screenshoot/screenshoots/threeclients.png?raw=true "gRPC Three clients")

**Scenario:**

1. Third client joined the server and pick a nick name
2. First and second client were members of #IF-ITB and PAT. Third client was a member of #IF-ITB only.
3. First client sent a message to all channel.
4. All client could read the messages as they are members of IF-ITB.
5. Second client sent a message to #PAT.
6. Only first and second client that received the messages as they were the members of #PAT and third client wasn't.
