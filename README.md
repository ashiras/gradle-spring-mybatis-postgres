[![wercker status](https://app.wercker.com/status/c788ad2e9107e70e24ff298854efeaaa/m/master "wercker status")](https://app.wercker.com/project/byKey/c788ad2e9107e70e24ff298854efeaaa)

# Java 開発環境の構築

1. jdk の設定
2. ビルドツール(gradle) のインストール
3. Postgres in Docker のインストール
4. プロジェクトの clone とコンパイルおよび実行

## JDK

- JDK1.8 を利用
- 複数の JDK がインストールされている場合には、切り替えること

```bash
$ /usr/libexec/java_home -V
Matching Java Virtual Machines (2):
    1.8.0, x86_64:      "Java SE 8"     /Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home
    1.7.0_45, x86_64:   "Java SE 7"     /Library/Java/JavaVirtualMachines/jdk1.7.0_45.jdk/Contents/Home
```

.bash_profile 等に設定を記載する

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)
PATH=${JAVA_HOME}/bin:${PATH}
```

## gradle 

### sdkman をインストールする

```
$ curl -s "https://get.sdkman.io" | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
```

### Gradle のインストール

```
$ sdk install gradle 4.10.2
```

## Postgres のインストール

### Docker コンテナーをインストールする

- brew cask install docker

### Postgres in Docker のインストール

```
docker run -d --name postgres95 -e POSTGRES_PASSWORD=test -p 5432:5432 postgres:9.6.5
```

## プロジェクトの clone とコンパイルおよび実行

```
$ git clone [プロジェクト]
$ cd [プロジェクトディレクトリ]
$ gradle build
$ gradle run
```

## ディレクトリ

```
|- controller  REST API
|- model       OR-Mapper および POJO
|- Service     Transaction Manager　　および JPA
```
