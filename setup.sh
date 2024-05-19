# Update package lists, upgrade installed packages, and install the unzip package
sudo apt update && sudo apt upgrade && sudo apt install -y unzip \

# Download Oracle JDK 22 installer package and Apache Maven 3.9.6 binary zip file
&& wget https://download.oracle.com/java/22/latest/jdk-22_linux-x64_bin.deb \
&& wget https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip \

# Install Oracle JDK 22 package, unzip Apache Maven, and set environment variables
&& sudo dpkg -i jdk-22_linux-x64_bin.deb && unzip -q apache-maven-3.9.6-bin.zip \
&& export MAVEN_HOME="$(pwd)/apache-maven-3.9.6" && export PATH="$MAVEN_HOME/bin:$PATH" \

# Check the installed Java and Maven versions
&& java --version && mvn -v
