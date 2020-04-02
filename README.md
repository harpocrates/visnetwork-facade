### `visnetwork-facade`

Strongly-typed scala.js facade for [`vis-network`][visjs], written to target
version 7.5.1. It is expected that `Network` and `DataSet` are available under
a globally available `vis` object, as with

```html
<script
  type="text/javascript"
  src="https://unpkg.com/vis-network/standalone/umd/vis-network.min.js"
></script>
```

Thanks to [`scala-js-ts-importer`][ts-importer] which made it possible to generate
a first pass of the facade directly from the Typescipt bindings provided with
`vis-network` (see `Network.d.ts`).

[ts-importer]: https://github.com/sjrd/scala-js-ts-importer
[visjs]: https://github.com/visjs/vis-network
