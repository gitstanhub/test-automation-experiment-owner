# Experimental project with UI autotests configured by "Owner" library

## Stack: 
- Playwright (Java)
- Gradle
- JUnit5
- Owner
- Docker
- Kubernetes

Run locally:
```
gradle clean test -Denv=local -Dcountry=de
gradle clean test -Denv=local -Dcountry=uk
```

Run on a remote machine: &#42;

```
gradle clean test -Denv=remote -Dcountry=de
gradle clean test -Denv=remote -Dcountry=uk
```

&#42; A Moon instance is required for remote run. You can roll out new localhost Moon instance on MacOS:

1. Launch Docker Desktop and enable Kubernetes in the settings.

2. Install Helm:
```
brew install helm
```

3. Add Aerokube charts repository:
```
helm repo add aerokube https://charts.aerokube.com/
helm repo update
```

4. Create a Namespace:
```
kubectl create namespace moon
```

5. Install a Moon type:
```
helm install moon aerokube/moon --namespace
```
