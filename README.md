# tech.neanderthal

Neandtheral bindings to the techascent ecosystem.


## Usage

#### MKL

Install intel's mkl.  Some basic instructions are in the 
[tvm-clj documentation](https://github.com/techascent/tvm-clj/#building-the-tvm-java-bindings).


##### Setup library paths to find MKL
```console
# Setup LD_LIBRARY_PATH to point to mkl
source scripts/library-path
```

You should be able to run `lein test`.


## License

Copyright © 2019 Techascent, LLC

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.
