# Experimental project with UI autotests configured by "Owner" library

## Stack: 
- Playwright (Java)
- Gradle
- JUnit 5
- Owner
- Docker
- Kubernetes

Run locally:  
```
gradle clean test -Denv=local -Dcountry=de
```
```
gradle clean test -Denv=local -Dcountry=uk
```

Run on a remote machine: &#42;

```
gradle clean test -Denv=remote -Dcountry=de
```
```
gradle clean test -Denv=remote -Dcountry=uk
```

&#42; A Moon server is required for remote run. Follow these steps to create new Moon server on localhost:

1. Install Docker
 - macOS/Windows: Download and install Docker Desktop from https://www.docker.com/products/docker-desktop
 - Linux: Follow the installation guide for your distribution from https://docs.docker.com/engine/install/
   
2. Enable Kubernetes

For macOS/Windows:
- Open Docker Desktop preferences/settings
- Go to the "Kubernetes" tab and enable Kubernetes

For Linux users, install `minikube` and start a local cluster:
- Follow the installation instructions at https://minikube.sigs.k8s.io/docs/start/
- To create a local cluster, run:
```
minikube start
```

3. Install Helm:
```
brew install helm
```

4. Add Aerokube charts repository:
```
helm repo add aerokube https://charts.aerokube.com/
```
```
helm repo update
```

5. Create a Namespace:
```
kubectl create namespace moon
```

6. Install a Moon type:
```
helm install moon aerokube/moon --namespace
```
